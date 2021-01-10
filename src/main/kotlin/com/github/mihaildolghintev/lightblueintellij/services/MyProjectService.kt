package com.github.mihaildolghintev.lightblueintellij.services

import com.intellij.openapi.project.Project
import com.github.mihaildolghintev.lightblueintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
