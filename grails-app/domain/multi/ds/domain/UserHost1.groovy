package multi.ds.domain

class UserHost1 extends BaseUser {

    static mapping = {
        table 'users'
        datePromoted sqlType: 'date'
    }
}
