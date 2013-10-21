package multi.ds.domain

class UserHost2 extends BaseUser {

    Date datePromoted

    static mapping = {
        table 'users'
        datasource 'dataSource2'
        datePromoted sqlType: 'date'
    }
}
