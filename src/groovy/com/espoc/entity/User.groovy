package com.espoc.entity

import groovy.transform.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.*

import java.text.DecimalFormat
import java.text.SimpleDateFormat

@ToString
@Setting(settingPath = 'elasticSearchSettings/analyzer.json')
@Document(indexName = 'user', type = 'user')
class User implements Serializable {

    @Id
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    String id

    @Field(type = FieldType.String, index = FieldIndex.analyzed, indexAnalyzer = "generic_analyzer", searchAnalyzer = "generic_analyzer")
    String emailId


    @Field(type = FieldType.String, index = FieldIndex.analyzed, indexAnalyzer = "generic_analyzer", searchAnalyzer = "generic_analyzer")
    String firstName
}
