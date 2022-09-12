 
listView('AGAGAGAG2 Jobs') {
    description('AGAGAGAG2 Jobs')
    jobs {
        regex('AGAGAGAG2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
