package multi.ds.domain

class UserHost1 extends BaseUser {

    static mapping = {
        table 'my_users'
        datePromoted sqlType: 'date'
    }
}
