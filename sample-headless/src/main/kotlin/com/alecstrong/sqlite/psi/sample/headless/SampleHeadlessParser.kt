package com.alecstrong.sqlite.psi.sample.headless

import com.alecstrong.sqlite.psi.core.SqliteCoreEnvironment
import com.alecstrong.sqlite.psi.sample.core.SampleFileType
import com.alecstrong.sqlite.psi.sample.core.SampleParserDefinition
import java.io.File

class SampleHeadlessParser {
  fun parseSqlite() {
    val parserDefinition = SampleParserDefinition()
    val environment = SqliteCoreEnvironment(parserDefinition, SampleFileType, listOf(
        File("sample-headless")))
    environment.annotate(SampleHeadlessAnnotator())
  }
}

fun main(args: Array<String>) {
  SampleHeadlessParser().parseSqlite()
}