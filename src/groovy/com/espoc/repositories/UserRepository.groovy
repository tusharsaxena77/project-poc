package com.espoc.repositories

import com.as.core.entities.auth.User
import com.espoc.entity.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.elasticsearch.annotations.Query
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface UserRepository extends ElasticsearchRepository<User, String> {


   /* Long countByEmailIdAndIsDeletedFalseAndIsBackendUserFalse(String emailId)

    User findByEmailIdAndIsDeletedFalseAndIsBackendUserFalse(String emailId)

    Long countByEmailIdAndIsDeletedFalseAndIsBackendUserTrue(String emailId)

    User findByEmailIdAndIsDeletedFalseAndIsBackendUserTrue(String emailId)

    User findByIdAndIsDeletedFalseAndIsBackendUserFalse(String Id)

    Long countByMobileNumberAndIsDeletedFalseAndIsBackendUserFalseAndIdNot(String phoneNumber, String userId)

    Long countByMobileNumberAndIsDeletedFalseAndIsBackendUserFalse(String phoneNumber)

    User findByMobileNumberAndIsDeletedFalseAndIsBackendUserFalse(String phoneNumber)

    Long countByMobileNumberAndIsDeletedFalseAndIsBackendUserTrue(String phoneNumber)

    User findByMobileNumberAndIsDeletedFalseAndIsBackendUserTrue(String phoneNumber)


    List<User> findAllByMobileNumber(String mobileNumber)

    List<User> findByIdIn(Collection<String> id)

    List<User> findByEmailIdIn(Collection<String> emailId)

    Long countByIdIn(Collection<String> id)

    Long countByIsDeletedFalse()

    Long countByIsBackendUserAndIsDeleted(Boolean isBackendUser , Boolean isDeleted )

    @Query("{\"match\":{\"formattedDob\":\"?0\"}}")
    List<User> findByFormattedDob(String date)

    @Query("{\"filtered\":{\"query\":{\"bool\":{\"must\":[{\"term\":{\"enabled\":true}} ,{\"term\":{\"isDeleted\":false}},{\"query_string\":{\"fields\":[\"emailId\",\"firstName\",\"lastName\",\"mobileNumber\",\"zipCode\",\"country\",\"state\" , \"gender\",\"id\"],\"query\":\"*?0*\",\"analyze_wildcard\":true}}]}},\"filter\":{\"terms\":{\"id\":?1}}}}")
    Page<User> searchForUsers(String queryString, List<String> ids, Pageable pageable)

    @Query("{\"bool\": {\"must\": [{\"term\": {\"isDeleted\": false}} ,{\"term\": {\"isBackendUser\": true}} ,{\"query_string\": {\"fields\":[\"emailId\",\"firstName\",\"lastName\"],\"query\": \"*?0*\",\"analyze_wildcard\": true}}]}}")
    Page<User> searchForBackendUsers(String query, Pageable pageable)

    @Query("{\"bool\": {\"must\": [{\"term\": {\"isDeleted\": false}} ,{\"term\": {\"isBackendUser\": true}} ,{\"query_string\": {\"fields\":[\"emailId\",\"firstName\",\"lastName\"],\"query\": \"*?0*\",\"analyze_wildcard\": true}} , {\"terms\": {\"id\": ?1}}]}}")
    Page<User> findUsersForSpecificRole(String queryString, List<String> ids, Pageable pageable)

    @Query("{\"filtered\":{\"query\":{\"bool\":{\"must\":[{\"term\":{\"enabled\":true}} ,{\"term\":{\"isDeleted\":false}},{\"term\":{\"isBackendUser\":false}},{\"query_string\":{\"fields\":[\"emailId\"],\"query\":\"*?0*\",\"analyze_wildcard\":true}}],\"must_not\":[{\"query_string\":{\"fields\":[\"emailId\"],\"query\":\"?1\"}}]}}}}")
    List<User> searchForUsersByEmailAndIsBackendUserFalseAndEmailNotIn(String queryString, String emails, Pageable pageable)

    @Query("{\"filtered\":{\"query\":{\"bool\":{\"must\":[{\"term\":{\"enabled\":true}} ,{\"term\":{\"isDeleted\":false}},{\"query_string\":{\"fields\":[\"emailId\"],\"query\":\"?0\"}}]}}}}")
    List<User> searchForUsersByEmail(String emails, Pageable pageable)*/
}


