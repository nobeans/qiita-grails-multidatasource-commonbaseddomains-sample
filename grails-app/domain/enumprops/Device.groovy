package enumprops

class Device {
    String name
    Platform platform

    static mapping = {
        table 'devices'
        platform inList: Platform.values()*.id, sqlType:'Int'
    }

    static constraints = {
    }
}