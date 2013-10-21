package multi.ds.domain

class UserHost2 extends BaseUser {

    static mapping = {
        table 'users'
        datasource 'second'
        datePromoted sqlType: 'date'
    }
}
