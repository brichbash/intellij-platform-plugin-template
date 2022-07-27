package org.jetbrains.plugins.template.services

import com.intellij.openapi.project.Project
import jnr.unixsocket.UnixSocket
import org.jetbrains.plugins.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
        UnixSocket(null)
    }
}
