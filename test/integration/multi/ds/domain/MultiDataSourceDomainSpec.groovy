package multi.ds.domain

import grails.test.spock.IntegrationSpec
import spock.lang.*

class MultiDataSourceDomainSpec extends IntegrationSpec {

    def user1, user2

    def setup() {
        user1 = new UserHost1(name: "taro", email: "taro@example.com", datePromoted: new Date())
        user2 = new UserHost2(name: "jiro", email: "jiro@example.com", datePromoted: new Date())
    }

    def "test save user1 to dataSource"() {
        when:
        user1.save(flush: true)

        then:
        !user1.hasErrors()
        UserHost1.count() == 1
    }

    def "test save user2 to dataSource2"() {
        when:
        user2.save(flush: true)

        then:
        !user2.hasErrors()
        UserHost2.count() == 1
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
    }
}
