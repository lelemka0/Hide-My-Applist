package com.tsng.hidemyapplist

import com.google.gson.Gson

class JsonConfig {
    class Template {
        val WhiteList = false
        val EnableAllHooks = false
        val ExcludeSystemApps = false
        val HideApps = setOf<String>()
        val ApplyHooks = setOf<String>()
    }
    class Scope {
        val TemplateLists = setOf<String>()
		val MainTemplate = null
    }

    var HookSelf = false
    var DetailLog = false
    var MaxLogSize = 512
    var Scopes = mutableMapOf<String, Scope>()
    var Templates = mutableMapOf<String, Template>()

    override fun toString(): String {
        return Gson().toJson(this)
    }

    companion object {
        @JvmStatic
        fun fromJson(str: String): JsonConfig {
            return Gson().fromJson(str, JsonConfig::class.java)
        }
    }
}