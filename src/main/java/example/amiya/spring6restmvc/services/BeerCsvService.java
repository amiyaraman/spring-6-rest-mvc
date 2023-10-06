package example.amiya.spring6restmvc.services;

import example.amiya.spring6restmvc.model.BeerCSVRecord;

import java.io.File;
import java.util.List;


public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}
