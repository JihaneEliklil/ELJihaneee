package fst.hns.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fst.hns.entities.Sector;
@RestController
public class SectorRestService {
    @Autowired
	private SectorRepository SR;
    @RequestMapping(value="/sectors",method = RequestMethod.GET)
    public List<Sector> ListSectors(){
    	return SR.findAll();
    	}
}

