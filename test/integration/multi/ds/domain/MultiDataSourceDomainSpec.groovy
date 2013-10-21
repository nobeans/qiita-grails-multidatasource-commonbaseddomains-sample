package multi.ds.domain

import grails.test.spock.IntegrationSpec
import spock.lang.*

class MultiDataSourceDomainSpec extends IntegrationSpec {

    def user1, user2

    def setup() {
        user1 = new UserHost1(name: "taro", email: "taro@example.com", datePromoted: new Date(1))
        user2 = new UserHost2(name: "jiro", email: "jiro@example.com", datePromoted: new Date(2))
    }

    def "test save user1 to dataSource"() {
        when:
        user1.save(flush: true)

        then:
        UserHost1.count() == 1
        !user1.hasErrors()
        with(user1) {
            name == "taro"
            email == "taro@example.com"
            datePromoted == new Date(1)
        }
    }

    def "test save user2 to dataSource2"() {
        when:
        user2.save(flush: true)

        then:
        UserHost2.count() == 1
        !user2.hasErrors()
        with(user2) {
            name == "jiro"
            email == "jiro@example.com"
            datePromoted == new Date(2)
        }
    }

    def "user1 and user2"() {
        when:
        user1.save(flush: true)
        user2.save(flush: true)

        then:
        !user1.hasErrors()
        UserHost1.count() == 1
        !user2.hasErrors()
        UserHost2.count() == 1

        when:
        def user1b = new UserHost1(name: "betty", email:"betty@example.com", datePromoted: new Date(3))
        user1b.save(flush: true)

        then:
        !user1b.hasErrors()
        UserHost1.count() == 2
        UserHost2.count() == 1
    }
}
