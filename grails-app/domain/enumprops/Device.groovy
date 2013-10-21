package enumprops

class Device {
    String name
    Platform platform

    static mapping = {
        table 'devices'
        platform enumType: "ordinal"
    }

    static constraints = {
    }
}