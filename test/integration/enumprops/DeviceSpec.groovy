package enumprops

import grails.test.spock.IntegrationSpec
import spock.lang.Specification

class DeviceSpec extends IntegrationSpec {

    void "using enum as property"() {
        given:
        def ios = new Device(name: "DEVICE-1", platform: Platform.iOS)

        when:
        ios.save(flush: true)

        then:
        !ios.hasErrors()
        ios.name == "DEVICE-1"
        ios.platform == Platform.iOS
    }
}
