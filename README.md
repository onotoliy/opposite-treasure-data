# Библиотека моделей данных

Библиотека моделей данных для МотоКлуба Оппозит.

#### Подключение

**Клиентская часть**:
```
repositories {
    maven {
        url  "https://dl.bintray.com/a-k-pohresniy/onotoliy"
    }
}


dependencies {
    compile 'com.github.onotoliy.opposite:treasure-data-js:1.0.0'
}
```

**Серверная часть**:
```
repositories {
    maven {
        url  "https://dl.bintray.com/a-k-pohresniy/onotoliy"
    }
}


dependencies {
    compile 'com.github.onotoliy.opposite:treasure-data-jvm:1.0.0'
}
```