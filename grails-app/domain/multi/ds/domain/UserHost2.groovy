package multi.ds.domain

class UserHost2 extends BaseUser {

    static mapping = {
        table 'my_users'
        datasource 'second'
        datePromoted sqlType: 'date'
    }
}
