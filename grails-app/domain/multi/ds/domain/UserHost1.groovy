package multi.ds.domain

class UserHost1 extends BaseUser {

    Date datePromoted

    static mapping = {
        table 'users'
        datasource 'dataSource'
        datePromoted sqlType: 'date'
    }
}
