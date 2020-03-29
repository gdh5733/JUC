package com.alan.demo.service.elasticsearch;

import com.alan.demo.entity.NbaPlayer;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface NBAPlayerService {

    boolean addPlayer(NbaPlayer player,String id) throws IOException;

    Map<String,Object> getPlayer(String id) throws IOException;

    boolean updatePlayer(NbaPlayer player,String id) throws IOException;

    boolean deletePlayer(String id) throws IOException;

    boolean deleteAllPlayer() throws IOException;

    boolean importAll() throws IOException;

    List<NbaPlayer> searchMatch(String key, String value) throws IOException;

    List<NbaPlayer> searchTerm(String key, String value) throws IOException;

    List<NbaPlayer> searchMatchPrefix(String key,String value) throws IOException;
}
