rootProject.name = "ddd"

include("value_objects")

include("boundaries")
include("boundaries:package_way")
include("boundaries:module_way")
include("boundaries:module_way:citizen")
include("boundaries:module_way:citizen:domain")
include("boundaries:module_way:citizen:app")

include("aggregate")
include("aggregate:citizen")
include("aggregate:citizen:domain")
include("aggregate:citizen:app")

include("events")
include("events:city_app")
include("events:citizen")
include("events:citizen:citizen_service")
include("events:citizen:domain")
include("events:townHall")
include("events:townHall:app")
include("events:townHall:domain")

include("libs")
include("libs:domain_utils")
