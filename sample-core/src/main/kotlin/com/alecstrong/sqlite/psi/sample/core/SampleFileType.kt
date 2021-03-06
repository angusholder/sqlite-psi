package com.alecstrong.sqlite.psi.sample.core

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType

object SampleFileType : LanguageFileType(SampleLanguage) {
  override fun getIcon() = AllIcons.Debugger.NewWatch
  override fun getName() = "Sample File"
  override fun getDefaultExtension() = "samplesql"
  override fun getDescription() = "Sample SQLite Language File"
}