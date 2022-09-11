-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 11, 2022 at 09:36 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugasakhir`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(35) NOT NULL,
  `nama_lengkap` varchar(200) NOT NULL,
  `password` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `nama_lengkap`, `password`) VALUES
(1, 'annash', 'Annash Zaenun Muhendra', '12345'),
(2, 'andi', 'Andi Taulani', '123456'),
(3, 'yudhie88', 'Yudhistira', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(11) NOT NULL,
  `kode` varchar(8) NOT NULL,
  `jenis` int(11) NOT NULL,
  `judul` varchar(68) NOT NULL,
  `tanggal` date NOT NULL,
  `pengarang` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `kode`, `jenis`, `judul`, `tanggal`, `pengarang`) VALUES
(1, 'SVJZGXVJ', 2, 'Ayat-Ayat Cinta', '2017-12-21', 'Habiburrahman El Shirazy'),
(2, 'KQKM6UJ5', 1, 'Ensiklopedia Komunikasi', '2015-04-03', 'Alex Sobur'),
(3, '0OCQBBQX', 4, 'Mari Bung Rebut Kembali', '2012-10-29', 'Willy Aditya'),
(4, 'ZR1PC9UI', 2, 'Rentang Kasih', '2017-09-03', 'Gita Savitri');

-- --------------------------------------------------------

--
-- Table structure for table `murid`
--

CREATE TABLE `murid` (
  `id_siswa` int(11) NOT NULL,
  `nis` int(5) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `alamat` varchar(41) NOT NULL,
  `no_telp` varchar(50) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `murid`
--

INSERT INTO `murid` (`id_siswa`, `nis`, `nama`, `alamat`, `no_telp`, `kelas`, `tanggal`) VALUES
(4, 40001, 'Dian Setiarini', 'Bekasi', '086772819291', '7A', '2022-02-01'),
(5, 40002, 'Noviansyah Nugroho', 'Jakarta Timur', '087826181924', '7B', '2022-01-01'),
(6, 40003, 'Lusi Bernard', 'Cibubur', '085672374192', '8A', '2022-01-01'),
(7, 40004, 'Michael Lambert', 'Jakarta Timur', '086374827316', '9B', '2022-01-01'),
(8, 40005, 'Budi Santoso', 'Jatisari', '087345267128', '7B', '2022-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL,
  `nis` int(5) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `kode` varchar(8) NOT NULL,
  `judul` varchar(68) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `nis`, `nama`, `kelas`, `kode`, `judul`, `tanggal`) VALUES
(10, 40001, 'Dian Setiarini', '7A', '0OCQBBQX', 'Mari Bung Rebut Kembali', '2022-09-08'),
(12, 40002, 'Noviansyah Nugroho', '7B', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-08'),
(13, 40002, 'Noviansyah Nugroho', '7B', 'KQKM6UJ5', 'Ensiklopedia Komunikasi', '2022-09-08'),
(14, 40004, 'Michael Lambert', '9A', 'KQKM6UJ5', 'Ensiklopedia Komunikasi', '2022-09-08'),
(15, 40004, 'Michael Lambert', '9A', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-09'),
(16, 40005, 'Budi Santoso', '7B', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-10');

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `id_pengembalian` int(11) NOT NULL,
  `nis` varchar(100) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `kode_buku` varchar(100) NOT NULL,
  `judul_buku` varchar(200) NOT NULL,
  `tanggal_kembali` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`id_pengembalian`, `nis`, `nama`, `kelas`, `kode_buku`, `judul_buku`, `tanggal_kembali`) VALUES
(3, '40002', 'Noviansyah Nugroho', '7B', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-08'),
(4, '40004', 'Michael Lambert', '9B', 'KQKM6UJ5', 'Ensiklopedia Komunikasi', '2022-09-12'),
(6, '40004', 'Michael Lambert', '9A', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-12'),
(7, '40005', 'Budi Santoso', '7B', 'ZR1PC9UI', 'Rentang Kasih', '2022-09-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`,`kode`) USING BTREE;

--
-- Indexes for table `murid`
--
ALTER TABLE `murid`
  ADD PRIMARY KEY (`id_siswa`,`nis`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`id_pengembalian`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id_buku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `murid`
--
ALTER TABLE `murid`
  MODIFY `id_siswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `pengembalian`
--
ALTER TABLE `pengembalian`
  MODIFY `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
