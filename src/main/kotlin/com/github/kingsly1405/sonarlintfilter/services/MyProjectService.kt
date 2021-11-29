package com.github.kingsly1405.sonarlintfilter.services

import com.intellij.openapi.project.Project
import com.github.kingsly1405.sonarlintfilter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
