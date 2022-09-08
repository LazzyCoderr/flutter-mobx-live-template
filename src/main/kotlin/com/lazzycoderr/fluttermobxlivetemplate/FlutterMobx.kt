package com.lazzycoderr.fluttermobxlivetemplate

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterMobx private constructor() :
    TemplateContextType("FLUTTER_MOBX_LIVE_TEMPLATE", "Flutter mobx live template") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}