package de.codecentric.gradle.plugin.opencms

import org.gradle.api.Project


class OpenCmsFeature {
    OpenCmsModule module
    Project project
    String name

    OpenCmsFeature(final OpenCmsModule module, final Project project) {
        this.module = module
        this.project = project
    }
}
