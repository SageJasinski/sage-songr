package com.sagesongr.songr.Interface;

import com.sagesongr.songr.DBmodal.AlbumModal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumInterface extends JpaRepository<AlbumModal, Long> {

}
