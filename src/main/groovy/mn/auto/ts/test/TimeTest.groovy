package mn.auto.ts.test

import grails.gorm.annotation.Entity

@Entity
class TimeTest {
    /**
     * Date record was created
     */
    Date dateCreated
    /**
     * Date record was last updated
     */
    Date lastUpdated
    String description
}
