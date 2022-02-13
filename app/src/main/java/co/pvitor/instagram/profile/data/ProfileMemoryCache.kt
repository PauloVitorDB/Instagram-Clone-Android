package co.pvitor.instagram.profile.data

import co.pvitor.instagram.common.model.UserAuth

object ProfileMemoryCache : ProfileCache<UserAuth> {

    private var userAuth: UserAuth? = null

    override fun isCached(): Boolean {
        return userAuth != null
    }

    override fun get(key: String) : UserAuth? {
        if(userAuth?.uuid == key) {
            return userAuth
        }
        return null
    }

    override fun put(data: UserAuth) {
        userAuth = data
    }

}