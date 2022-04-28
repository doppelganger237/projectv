import { createRouter,createWebHashHistory} from "vue-router";
const routes = [
    {
        path: '/',
        component: () => import('@/views/home')
    },
    {
        path: '/about',
        name: "about",
        component: () => import('@/views/about')
    },
    {
        path: '/login',
        name: "login",
        component: () => import('@/views/login')
    },
    {
        path: '/test',
        name: 'test',
        component: () => import('@/views/front/parcels/index')
    }
]
export const router = createRouter({
    history: createWebHashHistory(),
    routes: routes
})

export default router