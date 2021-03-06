dataSource {
    pooled = true
    dbCreate = "update"
    url = "jdbc:mysql://localhost:3306/grails"
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = "1234"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost:3306/grails?useUnicode=true&characterEncoding=UTF-8"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/grails?useUnicode=true&characterEncoding=UTF-8"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/grails?useUnicode=true&characterEncoding=UTF-8"
            
            }
        }
    }

