package com.makentoshe.booruchan.extension.gelbooru

import com.makentoshe.booruchan.extension.base.Source
import com.makentoshe.booruchan.extension.base.factory.HealthCheckFactory

class GelbooruSource : Source {

    override val id: String
        get() = "gelbooru"

    override val host: String
        get() = "https://gelbooru.com"

    override val title: String
        get() = "Gelbooru"

    override val healthCheckFactory: HealthCheckFactory
        get() = GelbooruHealthCheckFactory(host = host)

}
