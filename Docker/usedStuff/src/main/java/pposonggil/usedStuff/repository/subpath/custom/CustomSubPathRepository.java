package pposonggil.usedStuff.repository.subpath.custom;

import pposonggil.usedStuff.domain.SubPath;

import java.util.List;

public interface CustomSubPathRepository {
    List<SubPath> findSubPathsWithPath();

    List<SubPath> findSubPathsByPathId(Long pathId);
}