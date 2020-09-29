package uni.ykrank.plugin_base.utils;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class JsonUtil {
    @Nullable
    public static <T> T readValue(String src, Class<T> valueType) {
        try {
            return JSON.parseObject(src, valueType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    public static <T> T readValue(String src, TypeReference<T> typeReference) {
        try {
            return JSON.parseObject(src, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @NonNull
    public static String toJSONString(@Nullable Object obj) {
        if (obj == null) {
            return "";
        }
        return JSON.toJSONString(obj);
    }
}
