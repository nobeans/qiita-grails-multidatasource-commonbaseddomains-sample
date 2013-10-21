package enumprops

enum Platform {
    iOS(0),
    Android(1)

    final int id  // DBのカラムがInt型のとき、idというプロパティを持っているのが重要だった

    Platform(int id) {
        this.id = id
    }
}