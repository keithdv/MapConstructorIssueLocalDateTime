package mapconstructorissuelocaldatetime

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import java.time.*

class MyDomainSpec extends Specification implements DomainUnitTest<MyDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {

        setup:
        LocalDateTime created = LocalDateTime.now()

        when:
        MyDomain domain = new MyDomain(dateCreated: created, Value: 2)

        then:
        2 == domain.Value
        created == domain.dateCreated
    }
}
