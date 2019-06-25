package tsou.cn.myaroutertest.utils;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

import tsou.cn.lib_base.utils.RouteUtils;

public class FragmentUtils {
    public static Fragment getHomeFragment() {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.Home_Fragment_Main).navigation();
        return fragment;
    }

    public static Fragment getChatFragment() {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.Chat_Fragment_Main).navigation();
        return fragment;
    }

    public static Fragment getRecomFragment() {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.Recom_Fragment_Main).navigation();
        return fragment;
    }

    public static Fragment getMeFragment() {
        Fragment fragment = (Fragment) ARouter.getInstance().build(RouteUtils.Me_Fragment_Main).navigation();
        return fragment;
    }
}