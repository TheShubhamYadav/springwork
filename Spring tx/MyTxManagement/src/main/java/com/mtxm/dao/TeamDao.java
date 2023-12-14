package com.mtxm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.mtxm.bo.Team;

public class TeamDao {
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_TEAM = "insert into team(team_name, team_manager_name, team_type, level) values(?,?,?,?)";
	
	
	public TeamDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveTeam(Team team) {
		int teamId = 0;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_TEAM, new String[] {"team_id"});
				ps.setString(1, team.getTeamName());
				ps.setString(2, team.getTeamManagerName());
				ps.setString(3, team.getTeamType());
				ps.setString(4, team.getLevel());
				return ps;
			}
		}, keyHolder);
		
		teamId = keyHolder.getKey().intValue();
		return teamId;
	}

}
