beans = {
    applicationContextHolder(com.as.core.utils.ApplicationContextHolder) { bean ->
        bean.factoryMethod = 'getInstance'
    }
}