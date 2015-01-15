package org.nurigol.collections;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class ChunkedNodeSet<T extends Comparable<T>> {
	private ByteBuffer block;
	private int position = -1;
	private SortedSet<T> memorySet;

	private int numChunks;

	public ChunkedNodeSet(ByteBuffer block) {
		this.block = block;
	}

	public ChunkedNodeSet(ByteBuffer block, int position) {
		this.block = block;
		this.position = position;
	}

	public ChunkedNodeSet(ByteBuffer block, SortedSet<T> memorySet) {
		this.block = block;
		this.memorySet = memorySet;
	}

	/**
	 * Serializes contents in position.
	 * 
	 * @return
	 */
	public int serialize() throws Exception {
		if (position < 0)
			throw new Exception("ChunkedNodeList is not properly initialized.");

		// Compute chunking layout.
		Set<Chunk<T>> chunkList = computeChunk();

		// Serialize header information

		// Serialize each chunk

		// Update global information

		return -1;
	}

	private Set<Chunk<T>> computeChunk() {
		// Compute
		int totalSize = memorySet.size();

		// Compute chunk size
		int chunkSize = totalSize / 10;

		// Compute boundaries

		return null;
	}

	private class CONFIG {
		public static final int INITIAL_OFFSET = 10;
	}
}
