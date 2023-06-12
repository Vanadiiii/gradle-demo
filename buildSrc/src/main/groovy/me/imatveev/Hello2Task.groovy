package me.imatveev

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Hello2Task extends DefaultTask {
    @Override
    String getGroup() {
        return 'hello'
    }

    @TaskAction
    def hello2() {
        print('hello, world #2')
    }
}
