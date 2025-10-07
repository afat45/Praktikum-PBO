-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 07, 2025 at 05:12 PM
-- Server version: 8.4.3
-- PHP Version: 8.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pengajuaninvestasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `pengajuan_investasi`
--

CREATE TABLE `pengajuan_investasi` (
  `id` int NOT NULL,
  `namaInstrumen` varchar(100) NOT NULL,
  `tipeInstrumen` varchar(50) NOT NULL,
  `nilaiInvestasi` int NOT NULL,
  `pemilik` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pengajuan_investasi`
--

INSERT INTO `pengajuan_investasi` (`id`, `namaInstrumen`, `tipeInstrumen`, `nilaiInvestasi`, `pemilik`) VALUES
(1, 'BBCA', 'Saham', 9500000, 'Andi Pratama'),
(2, 'Bitcoin', 'Crypto', 7500000, 'Rina Sari'),
(3, 'BNI Dana Likuid', 'Reksadana', 2500000, 'Siti Aminah'),
(4, 'Obligasi FR0096', 'Obligasi', 8000000, 'PT Maju Bersama'),
(5, 'Apartemen Sudirman', 'Properti', 15000000, 'Dewi Lestari'),
(6, 'TLKM', 'Saham', 6000000, 'Bagus Hidayat'),
(7, 'Ethereum', 'Crypto', 5000000, 'Rudi Hartono'),
(8, 'Mandiri Pasar Uang', 'Reksadana', 4000000, 'Yuniarti'),
(9, 'Obligasi Telkom', 'Obligasi', 7000000, 'Agus Santoso'),
(10, 'Tanah Cikarang', 'Properti', 12000000, 'PT Nusantara Invest'),
(11, 'ASCII', 'Raja Crypto', 60000, 'Farhan Kebab'),
(12, 'Dogecoin', 'Crypto', 2000000, 'Firman Adi'),
(13, 'Panin Dana Prima', 'Reksadana', 4800000, 'Lestari Wulandari'),
(14, 'Obligasi Pemerintah FR95', 'Obligasi', 9000000, 'PT Alpha Capital'),
(15, 'Ruko Gading Serpong', 'Properti', 13000000, 'PT Sinar Terang'),
(16, 'ICBP', 'Saham', 6500000, 'Rahmat Hidayah'),
(17, 'Ripple', 'Crypto', 2500000, 'Linda Suryani'),
(18, 'CIMB Equity Fund', 'Reksadana', 4700000, 'Joko Prabowo'),
(19, 'Obligasi Korporasi BUMN', 'Obligasi', 8500000, 'PT Global Invest'),
(20, 'Hotel Kuta Residence', 'Properti', 14000000, 'PT Bali Sentosa'),
(22, 'Rusdi AND The Gang', 'Raja Muwani', 69, 'Ambatron dan rusdi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pengajuan_investasi`
--
ALTER TABLE `pengajuan_investasi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pengajuan_investasi`
--
ALTER TABLE `pengajuan_investasi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
