package com.sagesongr.songr.Interface;

import com.sagesongr.songr.DBmodal.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongInterface extends JpaRepository<Song, Long> {
public Song findByTitle(String title);

}
