package com.mtxm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.mtxm.bo.Player;
import com.mtxm.bo.Team;

public class PlayerDao {
	
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_PLAYER = "insert into player(player_name, sport_type, age, gender, email, team_id) values(?,?,?,?,?,?)";
	
	
	public PlayerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int savePlayer(Player player) {
		int playerNo = 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_PLAYER, new String[] {"player_no"});
				ps.setString(1, player.getPlayerName());
				ps.setString(2, player.getSportType());
				ps.setInt(3, player.getAge());
				ps.setString(4, player.getGender());
				ps.setString(5, player.getEmail());
				ps.setInt(6, player.getTeamId());
				return ps;
			}
		}, keyHolder);
		
		playerNo = keyHolder.getKey().intValue();
		return playerNo;
	}

}
