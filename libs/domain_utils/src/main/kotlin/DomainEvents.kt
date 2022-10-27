class DomainEvents {
    private val events: MutableList<EventCaller> = mutableListOf()

    fun publish() {
        events.forEach{ it() }
        events.clear()
    }

    fun add(event: EventCaller) {
        events.add(event)
    }

    operator fun plusAssign(eventCaller: EventCaller) {
        events.add(eventCaller)
    }
}

internal typealias EventCaller = () -> Unit
