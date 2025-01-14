package top.yinxueqin.createtestlog;

import androidx.annotation.NonNull;

/**
 * <p>用途：</p>
 *
 * @author yinxueqin@rd.hgits.cn
 * 创建时间: 2021/3/5 13:56
 * @author 更新者：
 * 更新时间:
 * 更新说明：
 * @since 1.0
 */
public interface LogInfo {

    void log(@NonNull final LogLevel priority, @NonNull final String tag, @NonNull final String message);
}
