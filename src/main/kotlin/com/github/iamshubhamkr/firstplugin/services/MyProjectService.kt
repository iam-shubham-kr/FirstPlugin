package com.github.iamshubhamkr.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.iamshubhamkr.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
