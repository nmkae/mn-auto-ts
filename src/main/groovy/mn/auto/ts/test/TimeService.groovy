package mn.auto.ts.test

import grails.gorm.transactions.Transactional

import javax.inject.Singleton

@Singleton
@Transactional
class TimeService {

    List<TimeTest> list(){
        TimeTest.list()
    }

    void saveTime() {
        new TimeTest(description: 'test').save().id
    }
}
