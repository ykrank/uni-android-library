package uni.ykrank.plugin_base.utils;


import android.support.annotation.Nullable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    static ObjectMapper mapper = JsonKotlinUtil.INSTANCE.getMapper();

    @Nullable
    public static <T> T readValue(String src, Class<T> valueType) {
        try {
            return mapper.readValue(src, valueType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    public static <T> T readValue(String src, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(src, typeReference);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
