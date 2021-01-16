package io.github.yxr1024.chinesechess.userstats;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import io.github.yxr1024.chinesechess.database.DaoPageParam;
import io.github.yxr1024.chinesechess.user.SearchUserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserStatsDao extends BaseMapper<UserStats> {
    @Select("" +
        " select" +
        "     users.*," +
        "     user_stats.play_count 'userStats.playCount'," +
        "     user_stats.win_count 'userStats.winCount'," +
        "     user_stats.lose_count 'userStats.loseCount'," +
        "     user_stats.draw_count 'userStats.drawCount'" +
        " from users" +
        " inner join user_stats on(users.id=user_stats.user_id)" +
        " ${ew.customSqlSegment}")
    IPage<SearchUserInfo> searchRankingUsers(DaoPageParam pageParam, @Param(Constants.WRAPPER) QueryWrapper wrapper);
}
