class UserHost1 extends BaseUser {
    Date datePromoted
    static mapping = {
        table 'users'
        datasource 'host1'
        datePromoted sqlType: 'date'
    }
}
