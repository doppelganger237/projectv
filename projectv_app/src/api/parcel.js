import request from "@/utils/request";

export const getParcel = id => {
    return request({
        url: `/parcel${id}`,
        method : 'get'
    })
}

export const getParcelList = query => {
    return request({
        url: `/parcel`,
        method : 'get',
        params: query
    })
}