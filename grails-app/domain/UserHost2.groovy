class UserHost2 extends BaseUser {
    Date datePromoted
    static mapping = {
        table 'users'
        datasource 'host2'
        datePromoted sqlType: 'date'
    }
}
